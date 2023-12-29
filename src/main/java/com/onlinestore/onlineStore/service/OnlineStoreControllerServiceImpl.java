package com.onlinestore.onlineStore.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope
public class OnlineStoreControllerServiceImpl implements OnlineStoreControllerService {

    private final List<Integer> itemsId = new ArrayList<>();
    @Override
    public List<Integer> add(Integer[] id){
        Collections.addAll(itemsId, id);
        /*
        String[] listId = StringUtils.split(id, ", ");

        for (String item : listId){
            itemsId.add(Integer.parseInt(item));
        }
        return itemsId;
        */
        return itemsId;
    }

    @Override
    public List<Integer> get(){
        return itemsId;
    }

}
