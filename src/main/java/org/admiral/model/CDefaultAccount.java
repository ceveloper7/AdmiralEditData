package org.admiral.model;

public class CDefaultAccount implements Comparable {

    /* hold default account value */
    private String m_defaultAcct;

    /* hold getName property value*/
    private String m_name;

    /* create new instance of CDefaultAccount */
    public CDefaultAccount(){}
    public CDefaultAccount(String m_defaultAcct, String m_name){
        this.m_defaultAcct = m_defaultAcct;
        this.m_name = m_name;
    }

    public String getDefaultAcct(){
        return this.m_defaultAcct;
    }
    public String getName(){
        return this.m_name;
    }

    public void setDefaultAccount(String defaultAccount){
        this.m_defaultAcct = defaultAccount;
    }
    public void setName(String m_name){
        this.m_name = m_name;
    }

    @Override
    public int compareTo(Object o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public String toString(){
        if (m_defaultAcct==null || m_defaultAcct.trim().isEmpty()) {
            return("");
        }
        return(m_defaultAcct + " : " + m_name);
    }
}
