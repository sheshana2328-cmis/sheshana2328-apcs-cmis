import java.util.ArrayList;

public class GpsSoftwareDriver
{
    public static void main (String[] arg)
    {
        int i= 0;
        GpsSoftware TrailA = new GpsSoftware();
        System.out.print("TrailA\nindex Elevation \n" + TrailA);
        System.out.println("Trail's total distance is " + TrailA.getLength() + " Meters");
        System.out.println("Trail A is difficult: " + TrailA.isDifficult(0, TrailA.markers.size()-1));
        System.out.println("Trail A from marker number 3 to 5 is difficult: " + TrailA.isDifficult(3, 5));
        System.out.println("Trail A is level: " + TrailA.isLevelTrailSegment(0, TrailA.markers.size()-1));
        System.out.println("Trail A from marker number 2 to 4 is level: " + TrailA.isLevelTrailSegment(2, 4)+ "\n");
        
        
        ArrayList<Integer> newmarkers = new ArrayList<Integer>();
        newmarkers.add(2);
        newmarkers.add(89);
        newmarkers.add(60);
        newmarkers.add(90);
        newmarkers.add(23);
        newmarkers.add(91);
        newmarkers.add(122);
        newmarkers.add(89);
        newmarkers.add(2);
        newmarkers.add(90);
        newmarkers.add(13);
        newmarkers.add(89);
        newmarkers.add(90);
        GpsSoftware TrailB = new GpsSoftware(newmarkers);
        System.out.print("TrailB\nindex Elevation \n" + TrailB);
        System.out.println("Trail's total distance is " + TrailB.getLength() + " Meters");
        System.out.println("Trail C is difficult: " + TrailB.isDifficult(0, newmarkers.size()-1));
        System.out.println("Trail B from marker number 2 to 7 is difficult: " + TrailB.isDifficult(2, 7));
        System.out.println("Trail B is level: " + TrailB.isLevelTrailSegment(0, newmarkers.size()-1));
        System.out.println("Trail B from marker number 4 to 9 is level: " + TrailB.isLevelTrailSegment(4, 9)+ "\n");
        
        
        ArrayList<Integer> newMarkers2 = new ArrayList<Integer>();
        newMarkers2.add(99);
        newMarkers2.add(96);
        newMarkers2.add(89);
        newMarkers2.add(89);
        newMarkers2.add(89);
        newMarkers2.add(63);
        newMarkers2.add(70);
        newMarkers2.add(80);
        newMarkers2.add(30);
        newMarkers2.add(20);
        newMarkers2.add(63);
        newMarkers2.add(56);
        newMarkers2.add(78);
        GpsSoftware TrailC = new GpsSoftware(newMarkers2);
        System.out.print("TrailC\nindex Elevation \n" + TrailC);
        System.out.println("Trail's total distance is " + TrailC.getLength() + " Meters");
        System.out.println("Trail C is difficult: " + TrailC.isDifficult( 0 , newMarkers2.size() - 1));
        System.out.println("Trail C from marker number 3 to 9 is difficult: " + TrailC.isDifficult(3 , 9));
        System.out.println("Trail C is level: " + TrailC.isLevelTrailSegment (0 , newMarkers2.size() - 1));
        System.out.println("Trail C from marker number 2 to 4 is level: " + TrailC.isLevelTrailSegment( 2, 4) + "\n");
        
    }
}