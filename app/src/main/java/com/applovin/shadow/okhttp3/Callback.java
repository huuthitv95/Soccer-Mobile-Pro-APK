package com.applovin.shadow.okhttp3;

import androidx.core.app.NotificationCompat;
import com.ironsource.C11494Ie;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m43475d2 = {"Lcom/applovin/shadow/okhttp3/Callback;", "", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lcom/applovin/shadow/okhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", C11494Ie.f24627n, "Lcom/applovin/shadow/okhttp3/Response;", "okhttp"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface Callback {
    void onFailure(Call call, IOException e);

    void onResponse(Call call, Response response) throws IOException;
}
