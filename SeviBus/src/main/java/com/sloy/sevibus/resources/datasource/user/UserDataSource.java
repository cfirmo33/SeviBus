package com.sloy.sevibus.resources.datasource.user;

import com.sloy.sevibus.ui.SevibusUser;

import rx.Observable;

public interface UserDataSource {
    Observable<SevibusUser> getCurrentUser();
}
