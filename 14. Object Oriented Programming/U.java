// 21. Interfaces

import java.util.*;

public class U {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queen q1 = new Queen();
        q1.moves();
        Rook r1 = new Rook();
        r1.moves();
        King k1 = new King();
        k1.moves();
        sc.close();
        SmartPhone s1 = new SmartPhone();
        s1.takePhoto();
        s1.recordVideo();
        s1.makeCall();
        s1.sendMessage();
    }
}

// ********************** Interfaces *********************
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen Moves: Up, Down, Left, Right and Diagonal (In all four directions) ");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Rook Moves: Up, Down, Left & Right ");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("King Moves: Up, Down, Left, Right and Diagonal (In all four directions by one step) ");
    }
}

// ********************** Multiple Inharitance *********************

interface CameraDevice {
    void takePhoto();

    void recordVideo();
}

interface CommunicationDevice {
    void makeCall();

    void sendMessage();
}

class SmartPhone implements CameraDevice, CommunicationDevice {
    public void takePhoto() {
        System.out.println("SmartPhone can take photo.");
    }

    public void recordVideo() {
        System.out.println("SmartPhone can record video.");
    }

    public void makeCall() {
        System.out.println("SmartPhone can make call.");
    }

    public void sendMessage() {
        System.out.println("SmartPhone can send message.");
    }
}