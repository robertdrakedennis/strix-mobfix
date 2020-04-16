package gg.strix.mobfix.events;

import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.animal.Animal;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.entity.SpawnEntityEvent;

public class MobSpawn {
    /**
     * Don't even know if this will get fired, hopefully it does.
     * @param event
     */
    @Listener
    public void onMobSpawn(SpawnEntityEvent event){
        //System.out.println("Spawn Entity Event called!");
        event.getEntities().forEach( (x) ->{
           // System.out.println("Spawn Entity Event called!");
            if(x instanceof Animal){
                //System.out.println("Entity is an animal.");
                //System.out.println("Entity Health: " + ((Animal)x).health().get());
                if(((Animal)x).health().get() < 0D){
                    x.remove();
                }
            }

        });

    }
}
