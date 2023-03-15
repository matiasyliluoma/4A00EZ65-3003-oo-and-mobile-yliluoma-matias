public class MyString {
    private char[] data;
    public MyString(char[] data) {
        this.data = data;
    }

    public int length() {
        
        return data.length;
    }

    public char charAt(int x) {

        return data[x];
    }

    public boolean equals(MyString m) {

        return this.data.equals(m.data);
    }


    public String reverse() {

        String result = "";
        for(int i = data.length-1; i >= 0; i--) {
            result += data[i];
        }
        return result;
    }

    public boolean startsWith(String m) {
        
        String result = new String(data);
        return result.startsWith(m);
    }
}
