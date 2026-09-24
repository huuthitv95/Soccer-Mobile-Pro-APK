package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.utils.C11316g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C11316g.m25156a();
        C11316g.m25159a(adSessionConfiguration, "AdSessionConfiguration is null");
        C11316g.m25159a(adSessionContext, "AdSessionContext is null");
        return new C11271a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
