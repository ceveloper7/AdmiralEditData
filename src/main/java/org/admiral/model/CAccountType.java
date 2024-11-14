package org.admiral.model;

import java.util.ArrayList;
import java.util.List;

public class CAccountType {
    public static List<String> m_accountTypes = new ArrayList<>();
    static {
        m_accountTypes.add("");
        m_accountTypes.add("Asset");
        m_accountTypes.add("Liability");
        m_accountTypes.add("Owner's equity");
        m_accountTypes.add("Expense");
        m_accountTypes.add("Revenue");
        m_accountTypes.add("Memo");
    }

    /* hold property key*/
    private String key;
    /* hold property name*/
    private String name;
    /* hold property admiralkey */
    private String admiralKey;

    /** Creates a new instance of CAccountType */
    public CAccountType() {
    }

    public String getKey() {

        return this.key;
    }
    public void setKey(String key) {

        this.key = key;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAdmiralKey(){
        return this.admiralKey;
    }
    public void setAdmiralKey(String admiralKey){
        this.admiralKey = admiralKey;
    }
}
