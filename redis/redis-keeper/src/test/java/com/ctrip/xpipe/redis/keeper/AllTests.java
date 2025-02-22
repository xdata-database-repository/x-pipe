package com.ctrip.xpipe.redis.keeper;

import com.ctrip.xpipe.redis.keeper.config.DefaultKeeperConfigTest;
import com.ctrip.xpipe.redis.keeper.container.KeeperContainerServiceTest;
import com.ctrip.xpipe.redis.keeper.handler.*;
import com.ctrip.xpipe.redis.keeper.impl.*;
import com.ctrip.xpipe.redis.keeper.impl.fakeredis.*;
import com.ctrip.xpipe.redis.keeper.monitor.PsyncFailReasonTest;
import com.ctrip.xpipe.redis.keeper.monitor.impl.DefaultKeeperStatsTest;
import com.ctrip.xpipe.redis.keeper.monitor.impl.DefaultMasterStatsTest;
import com.ctrip.xpipe.redis.keeper.monitor.impl.DefaultReplicationStoreStatsTest;
import com.ctrip.xpipe.redis.keeper.protocal.cmd.PsyncTest;
import com.ctrip.xpipe.redis.keeper.ratelimit.CompositeLeakyBucketTest;
import com.ctrip.xpipe.redis.keeper.ratelimit.DefaultLeakyBucketTest;
import com.ctrip.xpipe.redis.keeper.ratelimit.LeakyBucketBasedMasterReplicationListenerTest;
import com.ctrip.xpipe.redis.keeper.ratelimit.RateLimitTest;
import com.ctrip.xpipe.redis.keeper.store.*;
import com.ctrip.xpipe.redis.keeper.store.meta.TestAbstractMetaStoreTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author wenchao.meng
 * <p>
 * May 17, 2016 2:05:50 PM
 */
@RunWith(Suite.class)
@SuiteClasses({
        DefaultRedisKeeperServerConnectToFakeRedisTest.class,
        FakeRedisHalfRdbServerFail.class,
        PsyncTest.class,
        DefaultRedisClientTest.class,
        CommandHandlerManagerTest.class,
        RedisKeeperServerStateBackupTest.class,
        RedisKeeperServerStateActiveTest.class,
        RedisKeeperServerStateUnknownTest.class,
        DefaultRedisMasterReplicationTest.class,
        RedisMasterNewRdbDumperTest.class,
        KeeperContainerServiceTest.class,
        DefaultReplicationStoreManagerTest.class,
        DefaultRedisKeeperServerTest.class,
        DefaultReplicationStoreTest.class,
        DefaultRdbStoreTest.class,
        DefaultRdbStoreEofMarkTest.class,
        DefaultCommandStoreTest.class,
        DefaultRedisSlaveTest.class,
        RoleCommandHandlerTest.class,
        DefaultKeeperConfigTest.class,
        FakeRedisExceptionTest.class,
        FakeRedisRdbDumperTest.class,
        FakeRedisRdbDumpLong.class,
        PsyncHandlerTest.class,
        SlaveOfCommandHandlerTest.class,
        KeeperCommandHandlerTest.class,
        InfoHandlerTest.class,
        DefaultKeeperStatsTest.class,
        DefaultLeakyBucketTest.class,
        CompositeLeakyBucketTest.class,
        RateLimitTest.class,
        LeakyBucketBasedMasterReplicationListenerTest.class,
        DefaultReplicationStoreStatsTest.class,
        TestAbstractMetaStoreTest.class,
        PsyncFailReasonTest.class,
        DefaultMasterStatsTest.class
})
public class AllTests {

}
