
package io.github.JPA_Work;

import io.github.JPA_Work.models.Brigade;
import io.github.JPA_Work.models.Sample;
import io.github.JPA_Work.services.SampleService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SampleService service = new SampleService();

        String separator =
                "+-----+---------------------------+----------------------+---------------------------+";

        System.out.println(separator);
        System.out.printf(
                "| %-3s | %-25s | %-20s | %-25s |%n",
                "ID", "Название", "Вещество", "Бригада"
        );
        System.out.println(separator);

        List<Object[]> rows = service.getAllWithBrigade();

        for (Object[] row : rows) {
            Sample sample = (Sample) row[0];
            Brigade brigade = (Brigade) row[1];

            System.out.printf(
                    "| %-3d | %-25s | %-20s | %-25s |%n",
                    sample.getId_sample(),
                    sample.getName(),
                    sample.getSubstance(),
                    brigade != null ? brigade.getName() : "Нет бригады"
            );
        }

        System.out.println(separator);
    }
}
