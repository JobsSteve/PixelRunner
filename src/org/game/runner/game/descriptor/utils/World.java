/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.game.runner.game.descriptor.utils;

/**
 *
 * @author Karl
 */
public enum World {
    ARCADE(-1), TRAINING(0), MOUNTAINS(1), DESERT(2), CITY(3), FOREST(4), HILLS(5), SWEETS(6);
    
    private int id;
    
    private World(int id){
        this.id = id;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.id);
    }
}
