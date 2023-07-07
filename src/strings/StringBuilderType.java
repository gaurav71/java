package strings;

public class StringBuilderType {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append(" new world");
        builder.insert(5, ", brother");
        builder.delete(0, 5);
        builder.setCharAt(2, 'h');
        builder.deleteCharAt(3);
        builder.reverse();
        String str = builder.toString();
    }
}
