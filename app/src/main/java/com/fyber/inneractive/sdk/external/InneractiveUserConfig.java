package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveUserConfig {

    /* JADX INFO: renamed from: a */
    public int f17931a = -1;

    /* JADX INFO: renamed from: b */
    public Gender f17932b = null;

    /* JADX INFO: renamed from: c */
    public String f17933c = null;

    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i) {
        return i >= 1 && i <= 120;
    }

    public int getAge() {
        return this.f17931a;
    }

    public Gender getGender() {
        return this.f17932b;
    }

    @Deprecated
    public String getZipCode() {
        return this.f17933c;
    }

    @Deprecated
    public InneractiveUserConfig setAge(int i) {
        if (ageIsValid(i)) {
            this.f17931a = i;
            return this;
        }
        IAlog.m21950f("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        return this;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f17932b = gender;
            return this;
        }
        IAlog.m21950f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.m21947c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
            return this;
        }
        this.f17933c = str;
        return this;
    }
}
