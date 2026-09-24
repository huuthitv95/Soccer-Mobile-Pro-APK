package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class PayloadCallback {
    public abstract void onPayloadReceived(String str, Payload payload);

    public abstract void onPayloadTransferUpdate(String str, PayloadTransferUpdate payloadTransferUpdate);
}
