package ch06_abstract_interface.myinterface;

public class SmartPhone extends PDA implements Mp3, MobilePhone{
    String phoneNo;
    String songName;
    int playtime; // 재생 시간

    public SmartPhone(String phoneNo, String songName, int playtime){
        this.phoneNo = phoneNo;
        this.songName = songName;
        this.playtime = playtime;
    }

    public SmartPhone(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public boolean sendCall() {
        System.out.println("수신자 " + phoneNo + "에게 전화를 겁니다.");
        return true;
    }

    @Override
    public boolean receiveCall() {
        return false;
    }
    public boolean receiveCall(String message) {
        System.out.println("송신자 " + phoneNo + "로부터 " + message + "라는 문자가 왔습니다.");
        return false;
    }
    @Override
    public boolean sendSms() {
        return false;
    }
    public boolean sendSms(String[] sendlist) {
        System.out.println("휴대폰 1대에 문자를 여러 번 전송하기");
        System.out.println("수신자 " + phoneNo + "에게 여러 개의 문자를 전송합니다.");
        for (int i = 0; i < sendlist.length; i++) {
            System.out.println(i + 1 + "번째 문자 " + sendlist[i] + " 전송");
        }
        return true;
    }
    public boolean sendSms(String message){
        System.out.println("수신자 " + phoneNo + "에게 " + message + " 문자를 보냅니다.");
        return true;
    }

    @Override
    public boolean receiveSms() {
        System.out.println("송신자 " + phoneNo + "로 부터 문자를 받았습니다.");
        return false;
    }

    @Override
    public void play() {
        System.out.println("재생 정보");
        System.out.println("노래 : " + songName);
        System.out.println("재생 시간 : " + playtime/60 + "분 " + playtime%60 + "초");
    }
    public void play(String[] songs){
        System.out.println("여러 곡 재생하기");
        for (int i = 0; i < songs.length; i++) {
            System.out.println(i+1 + "번째 노래 " + songs[i] + " 재생");
        }
    }

    @Override
    public void stop() {
        System.out.println(songName + "을(를) 재생 중지합니다.");
    }
}
