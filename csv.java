/**
 * Write a description of csv here.
 * 
 * @author (Manuli Wanniarachchi) 
 * @version (12/23/2020)
 */

import edu.duke.*;
import org.apache.commons.csv.*;
public class csv {
    public void readfood(){
        FileResource fr=new FileResource();
        CSVParser parser=fr.getCSVParser();
        for(CSVRecord record:parser){
            System.out.print(record.get("Name")+" ");
            System.out.print(record.get("Favorite Color")+" ");
            System.out.println(record.get("Favorite Food"));
        }
    }
    
    public void listExportersTwoProducts(CSVParser parser,String exportitem1,String exportitem2){
       for(CSVRecord record:parser){
       String export=record.get("Exports");
       if((export.contains(exportitem1))&&(export.contains(exportitem2))){
           String country=record.get("Country");
           System.out.println(country);
           
        }
    }
    
}
    public void countryInfo(CSVParser parser,String country){
        for(CSVRecord record:parser){
       String c=record.get("Country");
       if(c.contains(country)){
           System.out.print(country+":");
           String export=record.get("Exports");
           System.out.print(export+":");
           String value=record.get("Value (dollars)");
           System.out.println(value);
           
        }
        
    }
        
        
    }
    
    public void numberOfExporters(CSVParser parser,String exportitem){
       int count=0;
        for(CSVRecord record:parser){
       String export=record.get("Exports");
       if(export.contains(exportitem)){
           String country=record.get("Country");
           count=count+1;
           
           
        }
    }
    System.out.println(count);
    
}
public void bigExporters(CSVParser parser,String amount){
        for(CSVRecord record:parser){
       String c=record.get("Value (dollars)");
       int lc=c.length();
       int lcheck=amount.length();
       if(lc>lcheck){
           String country=record.get("Country");
           System.out.print(country+" ");
           String value=record.get("Value (dollars)");
           System.out.println(value);
           
        }
        
    }
        
        
    }        
    
    
    public void tester(){
        FileResource fr=new FileResource();
        CSVParser parser=fr.getCSVParser();
        System.out.println("*******************");
        countryInfo(parser,"Nauru");
        CSVParser parser2=fr.getCSVParser();
        System.out.println("####################");
        listExportersTwoProducts(parser2,"gold","diamonds");
        CSVParser parser3=fr.getCSVParser();
        System.out.println(".....................");
        numberOfExporters(parser3,"gold");
        CSVParser parser4=fr.getCSVParser();
        System.out.println("//////////////////////");
        bigExporters(parser4,"$999,999,999,999");
        
        
    }
    
    
    
    

}