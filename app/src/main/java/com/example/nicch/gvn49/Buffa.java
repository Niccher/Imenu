package com.example.nicch.gvn49;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nicch on 4/8/18.
 */

public class Buffa extends StringRequest {
    private static final String Log_Path="https://muruakyone.000webhostapp.com/Gvn49/Login.php";
    //private static final String Log_Path="http://192.168.42.125/G49/Login.php";
    private Map<String, String> params;

    public Buffa(String eml, String password, Response.Listener<String> listener)
    {
        super(Method.POST,Log_Path,listener,null);
        params=new HashMap<>();
        params.put("Email",eml);
        params.put("Password",password);


    }
    public Map<String, String> getParams()
    {
        return params;
    }
}
