import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class GRL {
    static class ExportData{

        public void exportdata(int line) throws IOException{
            String path = "";
            File file = new File(path);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(line);
            bw.newLine();
            bw.close();
            fw.close();
        }
    }
    static class Dataset{
        private float distance;
        private float time;
        public Dataset(){
            this.distance=distance;
            this.time = time;
        }
    }
    static class Userinput{
        public float[] distanceandtime(int n){
            Scanner userin = new Scanner(System.in);
            System.out.print("Enter user "+(n+1)+"Distance: ");
            float distance = userin.nextFloat();

            System.out.print("Enter user "+(n+1)+"time: ");
            float time = userin.nextFloat();
            float entereddata[] = {distance,time};
            System.out.println("====");
            return entereddata;
        }
    }
    static class Measure{
        public float MeasureSpeed(float[] distanceandtime) {
            float f = distanceandtime[0]/distanceandtime[1];
            return (f);
        }
    }
    static class Showresults{
        public float results(int n){
            Dataset one = new Dataset();
            Userinput two = new Userinput();
            Measure qw = new Measure();
                return(qw.MeasureSpeed(two.distanceandtime(n)));
        }

    }
    public static void main(String[]args) throws IOException {
        Showresults kc =new Showresults();
        for(int i =0;i<3;i++) {
            System.out.println(kc.results(i));
            ExportData exportdata = new ExportData();
            exportdata.exportdata(56);
        }
        }


}
