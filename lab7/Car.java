package com.company;

import java.io.Serializable;

public class Car implements Serializable
{
    private String brand;
    private String yearOfRelease;
    private String color;
    private Character characters = new Character();
    private String condition = "Тільки з салону";
    private String price;

    public void setColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }

    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getYearOfRelease()
    {
        return yearOfRelease;
    }
    public void setYearOfRelease(String yearOfRelease)
    {
        this.yearOfRelease = yearOfRelease;
    }

    public String getCondition()
    {
        return condition;
    }
    public void setCondition(String condition)
    {
        this.condition = condition;
    }

    public String getPrice()
    {
        return price;
    }
    public void setPrice(String price)
    {
        this.price = price;
    }

    public void setCharacters(Character characters)
    {
        this.characters = characters;
    }
    public Character getCharacters() {
        return characters;
    }

    public String toString()
    {
        return "\t+-------------------------------------------------------+\n" +
                "\t| Марка: " + brand + "\n" +
                "\t| Рік випуску: " + yearOfRelease + "\n" +
                "\t| Колір: " + color + "\n" +
                "\t| Характеристики:\n" +
                "\t|  - максимальна швидкість: " + characters.getMaxSpeed() + "\n" +
                "\t|  - розгін: " + characters.getDispersal() + "\n" +
                "\t|  - витрата палива у місті/поза містом: " + characters.getFuelConIn() + " / " + characters.getFuelConOut() + "\n" +
                "\t|  - привід: " + characters.getTransmission() + "\n" +
                "\t| Стан: " + condition + "\n" +
                "\t| Ціна: " + price + "\n" +
                "\t+-------------------------------------------------------+";
    }
}