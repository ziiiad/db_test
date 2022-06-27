package com.ziad.db_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class DbController {

    final String CSV_PATH = "/Users/ziad/Downloads/Betriebsstellen.csv";

    @RequestMapping(value = "betriebsstelle/{bstelle}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String printBStelle(@PathVariable String bstelle){
        List<BetriebModel> csvAsList = getCsvAsList(CSV_PATH);
        BetriebModel treffer = csvAsList
                .stream()
                .filter(betrieb -> bstelle.toUpperCase().equals(betrieb.getRL100Code()))
                .findAny()
                .orElse(null);

        // Creating json using Jackson Library
        // ohter possibilities: GSON, org.json
        ObjectMapper om = new ObjectMapper();
        ObjectNode json = om.createObjectNode();
        json.put("Name",treffer.getRL100Langname());
        json.put("Kurzname", treffer.getRL100Kurzname());
        json.put("Typ", treffer.getTypKurz());

        return json.toPrettyString();
    }

    static List<BetriebModel> getCsvAsList(String path){
        List<BetriebModel> allLines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                allLines.add(new BetriebModel(Arrays.asList(fields)));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return allLines;
    }

}
