package com.aggroup.tpgestionmagazin.repository;

import com.aggroup.tpgestionmagazin.entity.Client;
import com.aggroup.tpgestionmagazin.entity.Facture;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FactureRepository extends JpaRepository<Facture,Long> {
    @Override
    public List<Facture> findAll() {
        return null;
    }

    @Override
    public List<Facture> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Facture> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Facture> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Facture entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Facture> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Facture> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Facture> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Facture> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Facture> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Facture> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Facture> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Facture getOne(Long aLong) {
        return null;
    }

    @Override
    public Facture getById(Long aLong) {
        return null;
    }

    @Override
    public Facture getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Facture> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Facture> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Facture> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Facture> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Facture> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Facture> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Facture, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
