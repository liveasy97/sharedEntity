package sharedDao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sharedEntity.gpsData;
import sharedEntity.historyData;

import java.util.List;
import java.util.UUID;

@Repository
public interface historyDataDao extends JpaRepository<historyData, UUID>{
    @Query("select t from historyData t where t.imei = :imei")
    public List<historyData> findByImei(String imei);

}
