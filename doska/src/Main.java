import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ChessBoardPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<String> cells = new HashSet<>();

        // Считываем координаты выпиленных клеток
        for (int i = 0; i < N; i++) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            cells.add(row + "," + col);
        }

        int perimeter = 0;

        // Проверяем каждую клетку и считаем периметр
        for (String cell : cells) {
            String[] parts = cell.split(",");
            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);

            // Проверяем каждую сторону клетки
            // Вверх
            if (!cells.contains((row - 1) + "," + col)) {
                perimeter++;
            }
            // Вниз
            if (!cells.contains((row + 1) + "," + col)) {
                perimeter++;
            }
            // Влево
            if (!cells.contains(row + "," + (col - 1))) {
                perimeter++;
            }
            // Вправо
            if (!cells.contains(row + "," + (col + 1))) {
                perimeter++;
            }
        }

        // Выводим результат
        System.out.println(perimeter);
    }
}
