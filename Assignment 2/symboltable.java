import java.util.*;

public class symboltable extends Object{
  private Hashtable<String, String> typ;
  private Hashtable<String, String> items;
  private Hashtable<String, LinkedList<String>> st;


  symboltable(){

    items = new Hashtable<>();
    typ = new Hashtable<>();
    st = new Hashtable<>();
    st.put("global", new LinkedList<String>());
  }


  public void insert(String identifier, String type, String object, String scope){

    LinkedList<String> scopes = st.get(scope);
    if(scopes == null){ scopes = new LinkedList<>();
      scopes.add(identifier);
      st.put(scope, scopes);
    } else{
      scopes.addFirst(identifier);
    }
    typ.put(identifier+scope, type);
    items.put(identifier+scope, object);
  }


  public void printSymTable(){

    Enumeration ennumeration = st.keys();

    while (ennumeration.hasMoreElements()){

      String scope = (String) ennumeration.nextElement();

      System.out.println("Scope is: "+ scope);
      LinkedList<String> itm = st.get(scope);
      for(String id : itm){
        String type = typ.get(id + scope);
        String object = items.get(id+scope);
        System.out.println("| " + id + " ---- " + object +":"+ type );
      }
    }

  }



}
