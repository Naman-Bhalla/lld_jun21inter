package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        NotebookRegistry notebookRegistry = new NotebookRegistry();
        notebookRegistry.registerNotebook(
                "a4_rule_120",
                new Notebook(
                        PageType.A4,
                        120,
                        RuleType.RULED
                ));
        notebookRegistry.registerNotebook(
                "a4_plain_120",
                new Notebook(
                        PageType.A4,
                        120,
                        RuleType.PLAIN
                )
        );

        java.util.List<String> input = List.of(
                "a4_rule_120",
                "a4_rule_120",
                "a4_rule_120",
                "a3_plain_120",
                "a3_plain_120",
                "a4_rule_120"
        );

        List<Notebook> notebooks = new ArrayList<>();

        for (String inp: input) {
            Notebook prototype = notebookRegistry.getNotebook(inp);
            if (prototype == null) {
                continue;
            }

            prototype.setFactPage(new FactPage());
            prototype.setFrontPage(new FrontPage());

            notebooks.add(prototype);
        }
    }

    // 1. Read a list of strings.
    // a4_rule_120
    // a4_plain_120
    // a3_plain_120
    // 2. Based upon the type of strings create
    // relevant object
    // 3. Add a random front page and fact page to it
    // Command Pattern
    // execute()
}
