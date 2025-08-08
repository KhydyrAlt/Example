import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TodoList {
    private final List<String> tasks = new ArrayList<>();

    // Добавление задачи в конец списка
    public void add(String task) {
        tasks.add(task);
    }

    // Добавление задачи на конкретную позицию
    public void add(int index, String task) {
        if (index >= 0 && index <= tasks.size()) {
            tasks.add(index, task);
        } else {
            add(task); // если индекс некорректный - добавляем в конец
        }
    }

    // Редактирование задачи
    public void edit(int index, String newTask) throws IndexOutOfBoundsException {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Неверный индекс задачи");
        }
        tasks.set(index, newTask);
    }

    // Удаление задачи
    public String delete(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Неверный индекс задачи");
        }
        return tasks.remove(index);
    }

    // Получение списка всех задач с нумерацией
    public String getAllTasks() {
        if (tasks.isEmpty()) {
            return "Список задач пуст";
        }
        return IntStream.range(0, tasks.size())
                .mapToObj(i -> (i + 1) + ". " + tasks.get(i))
                .collect(Collectors.joining("\n"));
    }

    // Проверка существования индекса
    public boolean isValidIndex(int index) {
        return index >= 0 && index < tasks.size();
    }
}