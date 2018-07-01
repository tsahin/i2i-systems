/*
COMMIT / ROLLBACK BENCHMARK
author: Tugba Sahin
date: 30.06.2018
definiton: created transaction_time_benchmark.pks
definiton: created transaction_time_benchmark.pkb
*/


@pks/transaction_time_benchmark.pks;
@pkb/transaction_time_benchmark.pkb;

BEGIN
 transaction_time_benchmark.operation_type(100,3);
 transaction_time_benchmark.transaction_time(1);
END;

