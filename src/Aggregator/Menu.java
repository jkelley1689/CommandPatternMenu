package Aggregator;

public class Menu {
    private MenuItem[] menu_items;
    private int current;

    public Menu(){
        menu_items = new MenuItem[10];
        initMenu();
    }

    public void addItem(MenuItem item){
        menu_items[findAvailIndex()] = item;
    }

    public void reset(){
        current = 0;
    }

    public boolean hasNext(){
        if(current == menu_items.length - 1)
            return false;
        return menu_items[current + 1] != null;
    }

    public MenuItem getItem(){
        return menu_items[current];
    }

    public MenuItem getNextItem(){
        return menu_items[current++];
    }

// private methods
    private void initMenu(){
        for(int i = 0; i < menu_items.length;i++)
            menu_items[i] = null;
    }

    private int findAvailIndex(){
        int i = 0;
        while(menu_items[i] != null)
            i++;

        return i;
    }
}
