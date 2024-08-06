class Solution {
  public boolean isValid(String str) {
    boolean isValidIp = true;
    String[] ip_str_arr = str.split("[.]", 0);
    if (ip_str_arr.length > 4) {
      isValidIp = false;
      return isValidIp;
    }
    for (String s : ip_str_arr) {
      if (s == "") {
        isValidIp = false;
        break;
      }
      if (!(Integer.parseInt(s) >= 0 && Integer.parseInt(s) <= 255)) {
        isValidIp = false;
        break;
      }
    }
    return isValidIp;
  }
}
