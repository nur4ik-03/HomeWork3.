package com.company;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Рик","Нурик","Дося"};
        for (int i = 0; i <= names.length; i++){
            switch (i) {
                case 1:
                    System.out.println("Здравствуйте " + names[0]);
                    break;
                case 2:
                    System.out.println("Приветсвую " + names[1] );
                    break;
                case 3:
                    System.out.println("День добрый "+ names[2] );
                    break;
            }
        }
    }
}