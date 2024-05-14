import request from '@/utils/request'

// 查询状态列表
export function listStatus(query) {
  return request({
    url: '/bussiness/status/list',
    method: 'get',
    params: query
  })
}

// 查询状态详细
export function getStatus(id) {
  return request({
    url: '/bussiness/status/' + id,
    method: 'get'
  })
}

// 新增状态
export function addStatus(data) {
  return request({
    url: '/bussiness/status',
    method: 'post',
    data: data
  })
}

// 修改状态
export function updateStatus(data) {
  return request({
    url: '/bussiness/status',
    method: 'put',
    data: data
  })
}

// 删除状态
export function delStatus(id) {
  return request({
    url: '/bussiness/status/' + id,
    method: 'delete'
  })
}
