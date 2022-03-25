package Chapter12;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> body = new ArrayList<>();
    private int column = 0;

    @Override
    public int getColumns() {
        return column;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return body.get(row);
    }

    public void add(String msg) {
        body.add(msg);
        updateColumn(msg);
    }

    private void updateColumn(String msg) {
        if (msg.getBytes().length > column) {
            column = msg.getBytes().length;
        }

        for (int row = 0; row < body.size(); row++) {
            int fills = column - body.get(row).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }

    private String spaces(int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}
