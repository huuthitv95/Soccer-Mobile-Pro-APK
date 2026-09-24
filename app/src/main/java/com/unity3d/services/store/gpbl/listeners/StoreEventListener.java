package com.unity3d.services.store.gpbl.listeners;

import kotlin.Metadata;

/* JADX INFO: compiled from: StoreEventListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m43475d2 = {"Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "Lcom/unity3d/services/store/gpbl/listeners/PurchaseHistoryResponseListener;", "Lcom/unity3d/services/store/gpbl/listeners/SkuDetailsResponseListener;", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", "Lcom/unity3d/services/store/gpbl/listeners/PurchaseUpdatedResponseListener;", "Lcom/unity3d/services/store/gpbl/listeners/FeatureSupportedListener;", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "operationId", "", "getOperationId", "()I", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface StoreEventListener extends PurchaseHistoryResponseListener, SkuDetailsResponseListener, PurchasesResponseListener, PurchaseUpdatedResponseListener, FeatureSupportedListener, BillingInitializationListener {
    int getOperationId();
}
