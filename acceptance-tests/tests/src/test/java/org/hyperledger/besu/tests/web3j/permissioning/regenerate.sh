for i in *.sol; do web3j solidity generate -b ./generated/$(echo $i | cut -f 1 -d '.').bin -a ./generated/$(echo $i | cut -f 1 -d '.').abi -o ../../../../../../ -p org.hyperledger.besu.tests.web3j.permissioning.generated; done

