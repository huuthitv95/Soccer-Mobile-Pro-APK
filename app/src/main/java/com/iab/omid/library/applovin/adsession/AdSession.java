package com.iab.omid.library.applovin.adsession;

import android.view.View;
import com.iab.omid.library.applovin.utils.C10950g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C10950g.m23354a();
        C10950g.m23357a(adSessionConfiguration, "AdSessionConfiguration is null");
        C10950g.m23357a(adSessionContext, "AdSessionContext is null");
        return new C10919a(adSessionConfiguration, adSessionContext);
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
