/*
* File: Database.java
* Author: Szász Benedek
* Copyright: 2026, Szász Benedek
* Group: Szoft II-N
* Date: 2026-10-21
* Github: https://github.com/BenedekSzasz
* Licenc: MIT
*/


package com.example;

import java.sql.Connection;

public interface Database {
    public Connection connect();
}
