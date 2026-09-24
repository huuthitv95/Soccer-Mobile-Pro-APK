package com.mbridge.msdk.out.strategy.component;

import android.app.Activity;
import com.mbridge.msdk.config.component.common.util.C12770c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class BidComponentStrategy extends BaseComponentStrategy implements IBidVideoAdStrategy {
    public BidComponentStrategy(String str, String str2, int i) {
        super(str, str2, i);
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public boolean isBidReady() {
        try {
            return isReadyWithSyncWait(true);
        } catch (Exception e) {
            C13219q0.m37817b("BaseComponentStrategy", "ComponentBidStrategy isBidReady error: " + e.getMessage(), e);
            return false;
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void loadFromBid(String str) {
        try {
            this.bidToken = str;
            HashMap map = new HashMap();
            map.put("bid_token", str);
            map.put("is_hb", 1);
            sendApiCallEvent(C12770c.m35199a(), "c1", map);
        } catch (Exception e) {
            C13219q0.m37817b("BaseComponentStrategy", "ComponentBidStrategy loadFromBid error: " + e.getMessage(), e);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid() {
        try {
            HashMap map = new HashMap();
            map.put("user_id", this.userId);
            map.put("user_extra_data", this.extraData);
            map.put("bid_token", this.bidToken);
            map.put("is_hb", 1);
            sendApiCallEvent(C12770c.m35199a(), "c2", map);
        } catch (Exception e) {
            C13219q0.m37817b("BaseComponentStrategy", "ComponentBidStrategy showFromBid error: " + e.getMessage(), e);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity) {
        C13008c.m36588n().m36527a(activity);
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str) {
        this.userId = str;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str) {
        this.userId = str;
        C13008c.m36588n().m36527a(activity);
        showFromBid();
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str, String str2) {
        this.userId = str;
        this.extraData = str2;
        C13008c.m36588n().m36527a(activity);
        showFromBid();
    }
}
