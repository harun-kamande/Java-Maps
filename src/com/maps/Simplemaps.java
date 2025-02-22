package com.maps;

import java.util.HashMap;
import java.util.Map;

public class Simplemaps {
    Map<Integer,String> member=new HashMap<>();

    public void add_something(int id,String name){
        member.put(id,name);

    }
    public String show_data(){
        return member.toString();
    }


}
