package strings;

public class StringBuilderType {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        builder.append(" new world");
        builder.insert(5, ", brother");
        builder.delete(0, 5);
        builder.reverse();
        String str = builder.toString();
    }
}
