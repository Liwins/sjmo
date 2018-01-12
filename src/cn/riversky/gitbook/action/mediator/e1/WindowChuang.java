package cn.riversky.gitbook.action.mediator.e1;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2018/1/9.
 */
public class WindowChuang {
    private TextPane textPane;
    private ListPane listPane;
    private GraphicPane graphicPane;

    public WindowChuang(TextPane textPane, ListPane listPane, GraphicPane graphicPane) {
        this.textPane = textPane;
        this.listPane = listPane;
        this.graphicPane = graphicPane;
    }

    public TextPane getTextPane() {
        return textPane;
    }

    public void setTextPane(TextPane textPane) {
        this.textPane = textPane;
    }

    public ListPane getListPane() {
        return listPane;
    }

    public void setListPane(ListPane listPane) {
        this.listPane = listPane;
    }

    public GraphicPane getGraphicPane() {
        return graphicPane;
    }

    public void setGraphicPane(GraphicPane graphicPane) {
        this.graphicPane = graphicPane;
    }

    public void panelChange(Panel panel){
        /**
         * 如果图片改变其他的也改变
         */
        if(panel==this.getGraphicPane()){
            System.out.println("图状态改变了");
            //其他部件跟着协调操作
        }
    }
}
