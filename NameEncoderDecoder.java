public class NameEncoderDecoder{

    public String encode (String name){
      String changeE = name.replace("e", "1");
      String changeU = changeE.replace("u", "2");
      String changeI = changeU.replace("i", "3");
      String changeO = changeI.replace("o", "4");
      String changeA = changeO.replace("a", "5");
      return "NOTFORYOU" + changeA + "YESNOTFORYOU";
    }
    public String decode (String name){
      String replacedNotforyou = encode(name).replace("YESNOTFORYOU", "");
      String replacedYesnotforyou = replacedNotforyou.replace("NOTFORYOU", "");
      String changeOne = replacedYesnotforyou.replace("1", "e");
      String changeTwo = changeOne.replace("2", "u");
      String changeThre = changeTwo.replace("3", "i");
      String changeFore = changeThre.replace("4", "o");
      String changeFife = changeFore.replace("5", "a");
      return changeFife;
    }
 }