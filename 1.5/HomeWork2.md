# Задача 1 - Оптимальный логический массив

Ваша задача - реализовать массив для хранение элементов **boolean** максимально выгодным по памяти образом:<br>
Необходимо создать массив байтов(**byte[]**) и логические переменные хранить в соответствующем бите<br>
т.е. массив из 2 байтов соответсвует массиву из 16 boolean<br>
<br>
При решении задачи стоит воспользоваться бинарными операциями:<br>
| - для установки значения в соответствующий бит<br>
& - для получения значения в соответствующем бите<br>
<< - для установки необходимого значения в нужный по счету бит<br>
К примеру, чтобы проверить, что в 5 бите переменной b лежит 1 можно следующим образом: _b & (1 << 5) != 0_<br>
<br>
В результате ваша программа должна раотать как обычный массив **boolean**<br>
<br>
Входные данные:<br>
Сначала вводится число **n** - количество элементов массива<br>
Далее n **true** или **false** - элементы массива<br>
<br>
Выходные данные вывести полученный массив<br>

---

Пример:
* 5<br>true true false true false -> true true false true false<br>
* 6<br>true true true true true true -> true true true true true true<br>
* 3<br>false false false -> false false false <br>
* 31<br>false false true false false false false false false false false false false false false false false false false false false false false false false false false false true false false ->false false true false false false false false false false false false false false false false false false false false false false false false false false false false true false false <br>
