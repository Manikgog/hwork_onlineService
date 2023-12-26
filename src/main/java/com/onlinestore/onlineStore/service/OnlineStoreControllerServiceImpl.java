package com.onlinestore.onlineStore.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class OnlineStoreControllerServiceImpl implements OnlineStoreControllerService {

    private final List<Integer> itemsId = new ArrayList<>();
    @Override
    public List<Integer> add(String id){
        String[] listId = StringUtils.split(id, ", ");
        for (String item : listId){
            itemsId.add(Integer.parseInt(item));
        }
        return itemsId;
    }

    @Override
    public List<Integer> get(){
        return itemsId;
    }

}
