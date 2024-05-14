import request from '@/utils/request'

// 查询评价结果列表
export function listPoint(query) {
  return request({
    url: '/bussiness/point/list',
    method: 'get',
    params: query
  })
}

// 查询评价结果详细
export function getPoint(id) {
  return request({
    url: '/bussiness/point/' + id,
    method: 'get'
  })
}

// 新增评价结果
export function addPoint(data) {
  return request({
    url: '/bussiness/point',
    method: 'post',
    data: data
  })
}

// 修改评价结果
export function updatePoint(data) {
  return request({
    url: '/bussiness/point',
    method: 'put',
    data: data
  })
}

// 删除评价结果
export function delPoint(id) {
  return request({
    url: '/bussiness/point/' + id,
    method: 'delete'
  })
}
