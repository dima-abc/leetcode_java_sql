# [2241. Design an ATM Machine](https://leetcode.com/problems/design-an-atm-machine/)

Здесь есть банкомат, в котором хранятся банкноты 5 номиналов: 20, 50, 100, 200 и 500 долларов. \
Изначально банкомат пуст. Пользователь может использовать автомат для внесения или снятия любой суммы денег. \
При снятии средств автомат отдает предпочтение банкнотам более крупного номинала. 
- Например, если вы хотите снять 300 долларов и у вас есть 2 банкноты по 50 долларов,  
1 банкнота по 100 долларов и 1 банкнота по 200 долларов, \
то автомат будет использовать банкноты номиналом 100 и 200 долларов.
- Однако, если вы попытаетесь снять 600 долларов 
и обнаружите 3 банкноты по 200 долларов и 1 банкноту по 500 долларов, \
запрос на снятие средств будет отклонен, \
поскольку автомат сначала попытается использовать банкноту по 500 долларов, \
а затем не сможет использовать банкноты для пополнения счета на оставшиеся 100 долларов. \
Обратите внимание, что в банкомате запрещено \
использовать банкноты номиналом 200 долларов вместо банкнот номиналом 500 долларов.

Реализуйте класс ATM:

- ATM() инициализирует объект ATM.
- void deposit(int[] banknotesCount). Вносите новые банкноты в порядке их поступления $20, $50, $100, $200, и 500 долларов.
- int[] withdraw(int amount). Возвращает массив длиной 5 из количества банкнот, которые будут переданы пользователю в заказе $20, $50, $100, $200, и 500 долларов, \
и обновляет количество банкнот в банкомате после снятия. \
Возвращает значение [-1], если это невозможно (в этом случае не снимайте банкноты).
---
### Example 1:

> Input \
> ["ATM", "deposit", "withdraw", "deposit", "withdraw", "withdraw"] \
> [[], [[0,0,1,2,1]], [600], [[0,1,0,1,1]], [600], [550]] \
> Output \
> [null, null, [0,0,1,0,1], null, [-1], [0,1,0,0,1]]
> 
> Explanation \
> ATM atm = new ATM();
> atm.deposit([0,0,1,2,1]); 
> // Deposits 1 $100 banknote, 2 $200 banknotes, \
> // and 1 $500 banknote. \
> atm.withdraw(600);        
> // Returns [0,0,1,0,1]. The machine uses 1 $100 banknote \
> // and 1 $500 banknote. The banknotes left over in the \
> // machine are [0,0,0,2,0]. \
> atm.deposit([0,1,0,1,1]); 
> // Deposits 1 $50, $200, and $500 banknote. \
> // The banknotes in the machine are now [0,1,0,3,1]. \
> atm.withdraw(600);        
> // Returns [-1]. The machine will try to use a $500 banknote \
> // and then be unable to complete the remaining $100, \
> // so the withdraw request will be rejected. \
> // Since the request is rejected, the number of banknotes \
> // in the machine is not modified. \
> atm.withdraw(550);       
> // Returns [0,1,0,0,1]. The machine uses 1 $50 banknote \
> // and 1 $500 banknote. \

### Constraints:

* banknotesCount.length == 5
* 0 <= banknotesCount[i] <= 10^9
* 1 <= amount <= 10^9
* At most 5000 calls in total will be made to withdraw and deposit.
* At least one call will be made to each function withdraw and deposit.
* Sum of banknotesCount[i] in all deposits doesn't exceed 10^9

---

## FAQ
[2241. Design an ATM Machine](https://leetcode.com/problems/design-an-atm-machine/)