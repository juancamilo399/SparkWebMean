package edu.escuelaing.arep;

import edu.escuelaing.arep.calculator.App;
import edu.escuelaing.arep.utilities.LinkedList;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



/**
 * Unit tests for app
 * @author Juan Camilo Angel Hernandez
 */
public class AppTest

{
    @Test
    public void shouldAdd()
    {
        LinkedList<Double> myLinkedList = new LinkedList<Double>();
        double[] values={1.0,2.0,3.0,4.0};
        boolean flag=false;
        for (Double value:values) {
            myLinkedList.add(value);
            flag=(myLinkedList.getTail().getValue().equals(value));
        }
        assertTrue(flag);
    }

    @Test
    public void shouldDelete()
    {
        LinkedList<Double> myLinkedList = new LinkedList<Double>();
        Double[] values={1.0,2.0,3.0,4.0};
        for (Double value:values) myLinkedList.add(value);
        myLinkedList.delete(2.0);
        assertEquals("1.0 3.0 4.0 ", myLinkedList.toString());
    }
/**
    @Test
    public void shouldReadAndAdd() throws Exception {
        LinkedList<Double> myLinkedList = null;
        myLinkedList=App.makeLinkedList("resources\\examples.txt");
        assertTrue(myLinkedList.head.getValue()==160.0 && myLinkedList.tail.getValue()==1503);
    }
*/
    @Test
    public void testMeanAndStandardDeviation() throws Exception {
        LinkedList<Double> myLinkedList = new LinkedList<Double>();
        Double[] values ={160.0,591.0,114.0,229.0,230.0,270.0,128.0,1657.0,624.0,1503.0};
        for (Double value:values) myLinkedList.add(value);
        double mean= App.mean(myLinkedList);
        double standard_deviation=App.standardDeviation(myLinkedList);
        assertEquals(550.6,mean,0.001);
        assertEquals(572.03,standard_deviation,0.001);
    }

    @Test
    public void test2MeanAndStandardDeviation() throws Exception {
        LinkedList<Double> myLinkedList = new LinkedList<Double>();
        double[] values={15.0,69.9,6.5,22.4,28.4,65.9,19.4,198.7,38.8,138.2};
        for (Double value:values) myLinkedList.add(value);
        double mean=App.mean(myLinkedList);
        double standard_deviation=App.standardDeviation(myLinkedList);
        assertEquals(60.32,mean,0.001);
        assertEquals(62.26,standard_deviation,0.001);
    }


}
