import java.util.ArrayList;
import java.util.Scanner;

void main()
/*
ID (a String)
FirstName
LastName
Title (a string like Mr., Mrs., Ms., Dr., etc.)
YearOfBirth (an int)
 */
{
    ArrayList<String> folks = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    boolean done = false;
    String personRec = "";
    String ID = "";
    String firstName = "";
    String lastName = "";
    String title = "";
    int YOB = 0;

    do {
        ID = SafeInput.getNonZeroLenString(in, "Enter the ID [6 digits]");
        firstName = SafeInput.getNonZeroLenString(in, "Enter the first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter the last name");
        title = SafeInput.getNonZeroLenString(in, "Enter the title");
        YOB = SafeInput.getRangedInt(in, "Enter the year of birth", 1000, 9999);

        personRec = ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
        folks.add(personRec);

        done = SafeInput.getYNConfirm(in, "Are you done?");
    }while(!done);

    for(String p: folks)
        System.out.println(p);
}
