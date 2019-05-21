package nullability.java;

public class Organizer {
    boolean closeMeeting(Meeting meeting) {
        if (meeting.canClose) return meeting.close();
        return false;
    }

    public static void main(String[] args) {
        Organizer org = new Organizer();
        // Throw NPE
        org.closeMeeting(null);
    }
}

class Meeting {
    public boolean canClose;

    public boolean close() {
        return false;
    }
}
