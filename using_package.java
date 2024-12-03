//how to import custom package..
import azan_naqvi.Matrix_Mul;
// import abc.azan_naqvi.Matrix_Mul;//if you create abc folder instead of . operater this package throws an error..
// import azan_naqvi.*;//Using * in the custom file throws an error..
// import abc.waqarul_naqvi.Del_Dub_Element;//if you create abc folder instead of . operater this package throws an error..
// import waqarul_naqvi.bye.kahallo.challo.ihi.*;//Using * in the custom file throws an error..
import waqarul_naqvi.bye.kahallo.challo.ihi.Del_Dub_Element;
// import abc.waqarul_naqvi.*;

public class using_package {
    public static void main(String[] args) {
        Matrix_Mul g =new Matrix_Mul();
        Del_Dub_Element sc =new Del_Dub_Element();
        System.out.println("I am using custom package..");
        
    }
    
}
