package com.design.concurrency.task;
interface TravelCompany {
    TravelQuote solicitQuote(TravelInfo travelInfo) throws Exception;
}