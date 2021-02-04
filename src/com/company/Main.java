package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Clerk clerk1 = new Clerk("Иванов Иван Иванович", "Директор", "dir@bk.ru",
                "+79370654445", 100000, 54);

        Clerk[] clerksArray = new Clerk[5];

        clerksArray[0] = new Clerk("Иванов Иван Иванович", "Директор", "dir@bk.ru",
                "+79370654445", 100000, 54);
        clerksArray[1] = new Clerk("Петрова Палина Петровна", "Бухгалтер", "buh@bk.ru",
                "+79370654446", 80000, 62);
        clerksArray[2] = new Clerk("Сидорова Анфиса Ивановна", "Секретарь", "sek@bk.ru",
                "+79370654447", 50000, 28);
        clerksArray[3] = new Clerk("Смирнов Александр Александрович", "Водитель", "vod@bk.ru",
                "+79370654448", 30000, 41);
        clerksArray[4] = new Clerk("Иванов Илья Иванович", "Менеджер", "men@bk.ru",
                "+79370654449", 40000, 26);

        for (int i = 0; i < clerksArray.length; i++) {
            if (clerksArray[i].age > 40) {
                System.out.println("Сотрудник №" + (i+1) + "\n"+ "ФИО: "+ clerksArray[i].fullName + "\n" + "Должность: "+ clerksArray[i].post+ "\n" + "Электронная почта: "+ clerksArray[i].email
                        + "\n" + "Номер телефона: "+ clerksArray[i].phoneNumber + "\n" + "Заработная плата: "+ clerksArray[i].wages+ " руб."+ "\n" + "Возраст: "+ clerksArray[i].age);
                System.out.println();

            }

        }


    }


}
