import java.rmi.*;
import java.rmi.server.*;
public class SearchQuery extends RemoteObject
implements Search
{

// Implementation of the query interface
public String query(String search)
throws RemoteException
{	
String result;
if (search.equals("Reflection in Java"))
result = "Found";
else
result = "Not Found";
return result; } }
