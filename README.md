# TravelPackageManager — Лабораторная работа по ООП и наследованию

**Java-приложение** для управления **туристическими пакетами** трёх типов:  
**Отдых**, **Экскурсии**, **Оздоровление**.

---

## Задача

> Создать систему классов для:
> - **Туров** (`TourPackage`) — абстрактный класс
> - **3 наследников**: `LeisureTour`, `ExcursionTour`, `HealthTour`
> - **Транспорт** (`Transport`)
> - **Поиск тура по направлению**

---

## Особенности

| Функция | Реализация |
|--------|-----------|
| **Полиморфизм** | Разные формулы стоимости и времени в пути |
| **Наследование** | Все туры — `TourPackage` |
| **Comparable** | Сортировка по количеству дней |
| **Поиск** | Поиск по `destination` с `try/catch` |
| **Локализация** | Все строки в `messages_ru_RU.properties` |
| **StringBuilder** | Эффективный вывод |

---

## Пример работы

```
Список всех туров:
[Excursion Tour] → Barcelona, 3 дня, Еда: NO, 456 км, Train (Railways Ltd.), Стоимость: 10500 руб., Время: 4.56 ч.
[Excursion Tour] → Rome, 4 дня, Еда: YES, 2300 км, Train (Railways Ltd.), Стоимость: 14000 руб., Время: 23.0 ч.
...
[Leisure Tour] → Maldives, 14 дней, Еда: NO, 540 км, Plane (Airways Inc.), Стоимость: 61000 руб., Время: 0.68 ч.

Поиск по направлению: Paris
Найден тур: [Excursion Tour] → Paris, 5 дней, Еда: NO, 900 км, Plane (Airways Inc.), Стоимость: 17500 руб., Время: 6.13 ч.
```

---

## Структура проекта

```
src/
├── ru.rsreu.savushkin0517/
│   └── ClientRunner.java                    — запуск
├── ru.rsreu.savushkin0517.travelpackage/
│   ├── TourPackage.java                     — абстрактный класс
│   ├── LeisureTour.java                     — отдых
│   ├── ExcursionTour.java                   — экскурсии
│   ├── HealthTour.java                      — оздоровление
│   └── manager/
│       └── TourPackageManager.java          — поиск
├── ru.rsreu.savushkin0517.travelpackage.data/
│   └── DataInitializer.java                 — тестовые данные
├── ru.rsreu.savushkin0517.travelpackege.transport/
│   └── Transport.java                       — транспорт
└── resources/
└── messages_ru_RU.properties            — локализация
```

---

## Как запустить

1. Убедитесь, что установлена **jdk1.8.0_144**
2. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/yourname/travel-package-manager.git
   ```
3. Перейдите в папку проекта и выполните:
   ```bash
   javac -d out -cp . src/ru/rsreu/savushkin0517/*.java src/ru/rsreu/savushkin0517/travelpackage/*.java src/ru/rsreu/savushkin0517/travelpackage/data/*.java src/ru/rsreu/savushkin0517/travelpackege/transport/*.java src/ru/rsreu/savushkin0517/travelpackage/manager/*.java
   java -cp out ru.rsreu.savushkin0517.ClientRunner
   ```

---

## Технологии

- **Java SE**
- **ООП**: абстрактные классы, наследование, полиморфизм, интерфейс `Comparable`
- **ResourceBundle** — локализация
- **StringBuilder** — сборка строк
- **try/catch** — обработка ошибок поиска

---

## Автор

**Савушкин Д.А.** - студент РГРТУ  
*Лабораторная работа — Наследование, полиморфизм, поиск в массиве объектов*